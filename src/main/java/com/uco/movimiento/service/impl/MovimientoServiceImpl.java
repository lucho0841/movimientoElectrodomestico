package com.uco.movimiento.service.impl;

import com.uco.movimiento.entity.MovimientoEntity;
import com.uco.movimiento.fabrica.MovimientoFabrica;
import com.uco.movimiento.model.businessexception.DocumentoRegistradoException;
import com.uco.movimiento.repository.MovimientoRepository;
import com.uco.movimiento.service.MovimientoService;
import com.uco.persona.command.MovimientoCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoServiceImpl implements MovimientoService {

	
	@Autowired
	private MovimientoRepository movimientoRepository;

	@Autowired
	private MovimientoFabrica movimientoFabrica;

	@Override
	public List<MovimientoCommand> findAll() {
		return movimientoFabrica.entityToCommand(movimientoRepository.findAll());
	}

	@Override
	public void registrarMovimiento(MovimientoCommand movimientoCommand) {
		MovimientoEntity movimientoEntity = movimientoFabrica.commandToEntity(movimientoCommand);
		movimientoRepository.save(movimientoEntity);
	}

	@Override
	public MovimientoCommand findById(int idMovimiento) {
		MovimientoCommand movimientoRetorno = null;
		if (movimientoRepository.findById(idMovimiento) != null) {
			movimientoRetorno = movimientoFabrica.entityToCommand(movimientoRepository.findById(idMovimiento));
		}
		
		return movimientoRetorno;
	}

	
}
