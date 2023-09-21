var getCurrentDayAndTime = function () {
    var daysOfWeek = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    var currentDate = new Date();
    var day = daysOfWeek[currentDate.getDay()];
    var hours = currentDate.getHours();
    var ampm = hours >= 12 ? 'PM' : 'AM';
    hours %= 12;
    hours = hours || 12;
    var minutes = currentDate.getMinutes().toString().padStart(2, '0');
    var seconds = currentDate.getSeconds().toString().padStart(2, '0');
    return "Today: ".concat(day, "\nTime: ").concat(hours, ":").concat(minutes, ":").concat(seconds, " ").concat(ampm);
};
var currentDayAndTime = getCurrentDayAndTime();
console.log(currentDayAndTime);
