const convertir = document.querySelector("#convertir");
const celcius = document.querySelector("#celcius");
const farenheit = document.querySelector("#farenheit");
const kelvin = document.querySelector("#kelvin");

console.log(convertir);
convertir.addEventListener("click", convertirFunction);

function convertirFunction(event) {
    if(isNaN(celcius.value)){
        alert("Introduzca un número válido")
        celcius.value = "";
        farenheit.value = "";
        kelvin.value = "";
        return Number.NaN;
    }
    let valorCelcius = Number(celcius.value);
    let valorFarenheit = (valorCelcius)*1.8+32;
    let valorKelvin = (valorCelcius)+273.15

    farenheit.value = valorFarenheit;
    kelvin.value = valorKelvin
    return 1;
}

// convertir.addEventListener("click", (event) => {
//     alert("Convirtiendo...")
// });
