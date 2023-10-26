
const evaluarNumeros = () => {
    const numeroA = prompt("Introduzca por favor el primer número");
    const numeroB = prompt("Introduzca por favor el segundo número");
    const numeroC = prompt("Introduzca por favor el tercer número");
    const entrada = document.querySelector('#entrada');
    const mayorMenorOut = document.querySelector('#mayorMenor');
    const menorMayorOut = document.querySelector('#menorMayor');

    console.log(entrada);

    if(numeroA === numeroB && numeroB === numeroC && numeroC === numeroA) {
        entrada.value = "Los números son iguales";
        mayorMenorOut.value = "";
        menorMayorOut.value = "";
    } else {
        let array = [numeroA, numeroB, numeroC];
        let mayorMenor = [...array];
        let menorMayor = [...array];

        entrada.value = array.join();
        mayorMenor.sort((a, b) => b - a);
        console.log(mayorMenor);
        mayorMenorOut.value = mayorMenor.join();
        menorMayor.sort((a, b) => a - b);
        console.log(menorMayor);
        menorMayorOut.value = menorMayor.join()
    }

    
}