const dateObj = new Date();

const currentDate = dateObj.toLocaleDateString();
const currentTime = dateObj.toLocaleTimeString();
const welcomeMessage = `Welcome! Pavan Kumar Naidu `;

console.log(`Today is ${currentDate} The current time is ${currentTime}  ${welcomeMessage}`);
// console.log(dateObj.toLocaleString());

