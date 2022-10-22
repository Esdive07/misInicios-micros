package com.rah.demo.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rah.demo.crud.entity.DireccionEntity;
import com.rah.demo.crud.entity.UserEntity;
import com.rah.demo.crud.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	// create
	public UserEntity createUser(UserEntity userEntity) {

		if (userEntity.getDocumento() != null && userEntity.getDocumento() > 0) {
			if (userEntity.getNombre() != null && !userEntity.getNombre().isBlank()) {
				if (userEntity.getApellido() != null && !userEntity.getApellido().isBlank()) {
					if (userEntity.getDireccionEntities().size() == 0) {

						List<DireccionEntity> direccionEntities = new ArrayList<>();

						DireccionEntity direccion = new DireccionEntity();
						direccion.setUserEntity(userEntity);
						direccion.setCodigoPostal(4444);
						direccion.setCalle(44);
						direccion.setLocalidad("General R44");
						direccion.setPuerta("4E");

						direccionEntities.add(direccion);
						userEntity.setDireccionEntities(direccionEntities);
					}
					return this.userRepository.save(userEntity);
				}
			}
		}
		return null;
	}

	// get all
	public List<UserEntity> getAllUser() {
		return this.userRepository.findAll();
	}

	// update
	public UserEntity updateUser(UserEntity userEntity, Integer id) {
		userEntity.setId(id);
		if (userEntity.getEdad() > 15 && userEntity.getDireccionEntities().size() == 0) {

			List<DireccionEntity> direccionEntities = new ArrayList<>();

			DireccionEntity direEntity = new DireccionEntity();
			direEntity.setCodigoPostal(555);
			direEntity.setLocalidad("jjjj");
			direEntity.setCalle(67);
			direEntity.setPuerta("1s");
			direEntity.setUserEntity(userEntity);

			direccionEntities.add(direEntity);
			userEntity.setDireccionEntities(direccionEntities);

			return this.userRepository.save(userEntity);
		} else

			return this.userRepository.save(userEntity);

	}

	// delete
	public void deleteUser(Integer id) {
		this.userRepository.deleteById(id);
	}

	// get by id
	public UserEntity getByIdUser(Integer id) {
		return this.userRepository.findById(id).get();
	}
}
