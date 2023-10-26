const campoNumero = document.querySelector('#numero');
const divRespuesta = document.querySelector('#respuesta');
const btnProbar = document.querySelector('#probar');

const MIN = 1;
const MAX = 100;

let random = Math.random() * (MAX - MIN) + MIN;
random = parseInt(random);
console.log(`El número secreto es: ${random}`)

btnProbar.addEventListener('click', validarNumero);

function validarNumero() {
    let valorNumero = parseInt(campoNumero.value);
    if(isNaN(valorNumero)) {
        alert("Ingrese un numero válido");
    } else {
        comprobar(valorNumero);
    }
}

function comprobar(numero) {
    let dispercion = Math.abs(random-numero)
    let mensaje = '';

    if(dispercion === 0) {
        mensaje = "FELICIDADES HAZ ACERTADO!!"
    } else if (dispercion >= 1 && dispercion <= 5) {
        mensaje = `Probaste el numero: ${numero}, Muy Caliente! Estas cerca!`
    } else if(dispercion > 5 && dispercion <= 15) {
        mensaje =  `Probaste el numero: ${numero}, Caliente`;
    } else if(dispercion > 15 && dispercion <= 30) {
        mensaje = `Probaste el numero: ${numero}, frio, prueba otro número`;
    } else if (dispercion > 30) {
        mensaje = `Probaste el numero: ${numero}, Muy frío, inténtalo otra vez`
    }

    mostrarMensaje(mensaje);
}

function mostrarMensaje(mensaje) {
    const respuesta = document.createElement('P');
    respuesta.textContent = mensaje;
    divRespuesta.appendChild(respuesta);
}