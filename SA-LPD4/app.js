const elementos = document.querySelector('#elementos')
const res = document.querySelector('#resultado')
const calcularBtn = document.querySelector('#calcular')

calcularBtn.addEventListener('click', validar);

function validar() {
    const elementosValue = parseInt(elementos.value)
    console.log(elementosValue);
    if(isNaN(elementosValue)) {
        return alert('Por favor ingrese un numero')
    } else {
        return calcularFinonacci(elementosValue);
    }
}

function calcularFinonacci(elementos) {
    let cadena = [];
    let sumandoA = 0;
    let sumandoB = 0;

    for (let i = 0; i < elementos; i++) {
        if(i < 2) {
            cadena.push(i);
            continue;
        }

        sumandoA = cadena[i-1];
        sumandoB = cadena[i-2];
        suma = sumandoA + sumandoB;

        cadena.push(suma);
    }

    mostrarResultado(cadena.join());
}

function mostrarResultado(cadena) {
    const resultado = document.createElement('P');
    resultado.textContent = cadena;
    res.appendChild(resultado);
}