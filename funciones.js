var miFuncion = function(n1,n2){
console.log('funcion 1');
return n1+n2;

};
//FUNCION DE FLECHA GORDA
var miFuncion2 = (n1,n2)=>{
//return'khe';
return n1+n2;

};

var jsonFunciones= {

funcionSuma : function(){

return 20+60;
},
funcionResta : function(){
   
    return 20+60;
    },
    funcionMulti : function(){
  
        return 20+60;
    },
    funcionDiv : function(){

        return 20/60;
        },
 };

//miFuncion();
//console.log(miFuncion(1,4));
//console.log(miFuncion2());
console.log("num1=20,num2=60"+
"\nSUMA:"+jsonFunciones.funcionSuma()+
"\nRESTA: "+jsonFunciones.funcionResta()+
"\nMULTIPLICACION: "+jsonFunciones.funcionMulti()+
"\nDIVISION: "+jsonFunciones.funcionDiv()
);
