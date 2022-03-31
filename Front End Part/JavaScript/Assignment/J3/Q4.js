function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

const shape = new person('Niall', 'Horan');
console.log(shape.firstName)
console.log(shape.lastName)
shape.lastName="Horan";
console.log(shape.firstName)
console.log(shape.lastName)