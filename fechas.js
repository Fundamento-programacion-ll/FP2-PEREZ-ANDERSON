const moment = require('moment');
moment.locale('es');
var fecha = new Date();
console.log(fecha);
console.log(fecha.getDate);
console.log(fecha.getHours);
console.log(fecha.getMonth);
console.log(fecha.getDay, fecha.getMonth, fecha.getFullYear);
console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(moment().format('dddd'));
console.log(moment().toObject());
console.log(moment().toObject());
console.log(moment().toString());


