package com.uco.movimiento.controller;

import com.uco.movimiento.service.MovimientoService;
import com.uco.persona.command.MovimientoCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/movimiento-electrodomestico")
public class MovimientoController {

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping("/listado-movimientos")
    public List<MovimientoCommand> findAll() {
        return movimientoService.findAll();
    }

    @PostMapping("/registro-movimiento")
    public void registrarMovimiento(@RequestBody MovimientoCommand movimientoCommand){
          movimientoService.registrarMovimiento(movimientoCommand);
    }

    @GetMapping("/buscar-movimiento")
    public MovimientoCommand encontrarPorIdMovimiento(int id){
        return movimientoService.findById(id);
    }
}
