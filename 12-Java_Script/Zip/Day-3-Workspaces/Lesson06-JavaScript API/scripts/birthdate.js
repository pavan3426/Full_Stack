window.addEventListener("load", function () {

    var calculateBirthDateButton = document.getElementById("birthdateButton");
    // On the Button Now We Need Register a Listener 
    calculateBirthDateButton.addEventListener("click", function () {

        var nextBirthDay = new Date();
        nextBirthDay.setDate(parseInt(dayElement.value));
        nextBirthDay.setMonth(parseInt(monthElement.value) - 1);
        nextBirthDay.setHours(0);
        nextBirthDay.setMinutes(0);
        if (nextBirthDay.getTime() < Date.now()) {
            //It is on next year.
            nextBirthDay.setFullYear(nextBirthDay.getFullYear() + 1);
        }
        var milliseconds = nextBirthDay.getTime() - Date.now();
        var hours = Math.round(milliseconds / (1000 * 60 * 60));
        var days = Math.round(hours / 24);
        var result = hours + " hours (" + days + " days) left before birthday!";

        var resultElement = document.getElementById("result");
        resultElement.innerHTML = result;
    });
});