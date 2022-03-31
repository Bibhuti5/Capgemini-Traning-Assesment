var string="name:'Harry',age:45";
console.log("Input string: "+string);

var obj= eval('({' + string + '})');
console.log(obj);

console.log("name:"+obj.name);
console.log("age: "+obj.age);