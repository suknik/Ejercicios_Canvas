const numero = document.querySelector('#numero')
const res = document.querySelector('#resultado')
const calcular = document.querySelector('#calcular');
calcular.addEventListener('click', mostrarResultado)


function factorial (numero) {
    return valor = numero === 0 ? 1 : numero * factorial(numero - 1);
}

function mostrarResultado () {
    const valorNum = parseInt(numero.value)
    const valor = document.createElement('P')
    valor.textContent = `El factorial de ${valorNum} es: ${factorial(valorNum)}`;
    res.appendChild(valor);
}