package com.uco.movimiento.fabrica;

import com.uco.movimiento.entity.MovimientoEntity;
import com.uco.persona.command.MovimientoCommand;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovimientoFabrica {

    public List<MovimientoCommand> entityToCommand(List<MovimientoEntity> listaPersonaEntity) {
        List<MovimientoCommand> listaMovimientoCommand = new ArrayList<>();
        listaPersonaEntity.forEach(e -> listaMovimientoCommand.add(entityToCommand(e)));
        return listaMovimientoCommand;
    }

    public MovimientoCommand entityToCommand(MovimientoEntity movimientoEntity) {
    	MovimientoCommand movimientoCommand = new MovimientoCommand();
        movimientoCommand.setIdMovimiento(movimientoEntity.getIdMovimiento());
        movimientoCommand.setSerial(movimientoEntity.getTipoElectrodomestico());
        movimientoCommand.setObservacion(movimientoEntity.getMarca());
        movimientoCommand.setTipoElectrodomestico(movimientoEntity.getSerial());
        movimientoCommand.setMarca(movimientoEntity.getObservacion());
        movimientoCommand.setDiagnosticoTecnico(movimientoEntity.getDiagnosticoTecnico());
        return movimientoCommand;
    }

    public MovimientoEntity commandToEntity(MovimientoCommand movimientoCommand){
        MovimientoEntity movimientoEntity = new MovimientoEntity();
        movimientoEntity.setSerial(movimientoCommand.getSerial());
        movimientoEntity.setObservacion(movimientoCommand.getObservacion());
        movimientoEntity.setTipoElectrodomestico(movimientoCommand.getTipoElectrodomestico());
        movimientoEntity.setMarca(movimientoCommand.getObservacion());
        movimientoEntity.setDiagnosticoTecnico(movimientoCommand.getDiagnosticoTecnico());
        return movimientoEntity;
    }

}
