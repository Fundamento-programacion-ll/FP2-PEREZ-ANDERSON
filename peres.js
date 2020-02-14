
var json1 ={
nombre:"paul",
edad: 23,
casado: false,
mascota:['cachetes'
],
colegio:{
nombreColegio:'montufar',
telefono: 123456789,
a:'',

}
};

var jsonPaul={
nombre:"Paul",
apellido:"Perez",
edad:23,

};

console.log('hola');
console.log(jsonPaul);
console.log(json1+jsonPaul);
var nu = null;
console.log("tipo:"+typeof nu);
var numero = 1;
console.log(json1+jsonPaul+numero);
var bool = true;
console.log(json1+jsonPaul+bool+numero);
console.log(undefined+numero);

