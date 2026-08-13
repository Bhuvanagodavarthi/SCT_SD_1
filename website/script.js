let temperature = document.getElementById("temperature");
let fromScale = document.getElementById("fromScale");
let toScale = document.getElementById("toScale");
let button = document.getElementById("convertBtn");
let result = document.getElementById("result");

button.addEventListener("click", function () {

    let value = Number(temperature.value);

    let celsius;

    // Convert to Celsius
    if (fromScale.value === "celsius") {
        celsius = value;
    }
    else if (fromScale.value === "fahrenheit") {
        celsius = (value - 32) * 5 / 9;
    }
    else {
        celsius = value - 273.15;
    }

    // Convert Celsius to target
    let answer;

    if (toScale.value === "celsius") {
        answer = celsius;
        result.innerText = "Result: " + answer.toFixed(2) + "°C";
    }
    else if (toScale.value === "fahrenheit") {
        answer = (celsius * 9 / 5) + 32;
        result.innerText = "Result: " + answer.toFixed(2) + "°F";
    }
    else {
        answer = celsius + 273.15;
        result.innerText = "Result: " + answer.toFixed(2) + "॰K";
    }

});