var string = '{ "name":"Niall", "age": 27}';
            console.log( "Input String:  " +string);
            
            var obj= JSON.parse( string);
            console.log("new object created");
            console.log("Name:"+obj.name);
            console.log("age:" +obj.age);