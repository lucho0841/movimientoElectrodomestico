package com.uco.movimiento.model;


import java.util.Date;

import com.uco.movimiento.model.businessexception.BusinessException;
import com.uco.movimiento.model.util.Validator;


public class Movimiento {
    private int idMovimiento;
    private String tipoElectrodomestico;
    private String marca;
    private String serial;
    private String observacion;
    private String diagnosticoTecnico;
    private Date fechaEntranda;
    private Date fechaSalida;

   
    public Movimiento() {
        super();
    }

    public static class MovimientoBuilder{
    		private int idMovimiento;
    	    private String tipoElectrodomestico;
    	    private String marca;
    	    private String serial;
    	    private String observacion;
    	    private String diagnosticoTecnico;
    	    private Date fechaEntranda;
    	    private Date fechaSalida;

       

        public void setIdMovimiento(int idMovimiento) {
				this.idMovimiento = idMovimiento;
			}
			public void setTipoElectrodomestico(String tipoElectrodomestico) {
				this.tipoElectrodomestico = tipoElectrodomestico;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public void setSerial(String serial) {
				this.serial = serial;
			}
			public void setObservacion(String observacion) {
				this.observacion = observacion;
			}
			public void setDiagnosticoTecnico(String diagnosticoTecnico) {
				this.diagnosticoTecnico = diagnosticoTecnico;
			}
			public void setFechaEntranda(Date fechaEntranda) {
				this.fechaEntranda = fechaEntranda;
			}
			public void setFechaSalida(Date fechaSalida) {
				this.fechaSalida = fechaSalida;
			}

		public Movimiento build() throws BusinessException {
            Movimiento movimiento = new Movimiento();
            movimiento.idMovimiento = this.idMovimiento;
            movimiento.tipoElectrodomestico = this.tipoElectrodomestico;
            movimiento.marca = this.marca;
            movimiento.serial = this.serial;
            movimiento.observacion = this.observacion;
            movimiento.diagnosticoTecnico = this.diagnosticoTecnico;
            movimiento.fechaEntranda = this.fechaEntranda;
            movimiento.fechaSalida = this.fechaSalida;

            return movimiento;
        }

    }

}
