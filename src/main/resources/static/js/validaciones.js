/**
 * 
 */
 
$(document).ready(function() {
	jQuery.validator.setDefaults({
	  debug: true,
	  success: "valid"
	});

	$("#miForm").validate({
		rules: {
			"rutCliente": {
				required: true,
				digits: true,
				rangelength: [8, 8]
			},
			"diaSemana": {
				required: true
			},
			"hora": {
				time: true,
				required: true
			},
			"lugar": {
				required: true,
				rangelength: [10, 50]
			},
			"duracion": {
				required: true,
				rangelength: [10, 70]
			},
			"nAsistentes": {
				required: true,
				max: 1000,
				min: 10
			}

		},
		messages: {
			"rutCliente": {
				required: "Introduce un RUT",
				digits: "Solo numeros",
				rangelength: "99999999"
			},
			"diaSemana": {
				required: "Selecciona un opcion"
			},
			"hora": {
				time: "hh:mm",
				required: "Introduce la hora"
			},
			"lugar": {
				required: "Introduce el lugar",
				rangelength: "Entre 10 y 50 caracteres"
			},
			"duracion": {
				required: "Introduce la duracion",
				rangelength: "Entre 10 y 70 caracteres"
			},
			"nAsistentes": {
				required: "Introduce la cantidad de asistentes",
				max: "Máximo 1000",
				min: "Mínimo 10"
			}
		}
	});

});