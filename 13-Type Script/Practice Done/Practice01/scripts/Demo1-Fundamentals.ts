// const getCurrentDayAndTime = (): string => {
//   const daysOfWeek = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
//   const currentDate = new Date();
//   const day = daysOfWeek[currentDate.getDay()];

//   let hours = currentDate.getHours();
//   const ampm = hours >= 12 ? 'PM' : 'AM';
//   hours %= 12;
//   hours = hours || 12;
//   const minutes = currentDate.getMinutes().toString().padStart(2, '0');
//   const seconds = currentDate.getSeconds().toString().padStart(2, '0');

//   return `Today: ${day}\nTime: ${hours}:${minutes}:${seconds} ${ampm}`;
// };

// const currentDayAndTime = getCurrentDayAndTime();
// console.log(currentDayAndTime);
