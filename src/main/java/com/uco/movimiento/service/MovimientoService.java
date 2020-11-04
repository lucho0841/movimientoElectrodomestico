package com.uco.movimiento.service;

import com.uco.movimiento.entity.MovimientoEntity;
import com.uco.persona.command.MovimientoCommand;

import java.util.List;

public interface MovimientoService {

    List<MovimientoCommand> findAll();

    void registrarMovimiento(MovimientoCommand movimientoCommand);

    MovimientoCommand findById(int idMovimiento);
}
