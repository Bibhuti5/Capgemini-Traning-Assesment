function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

const nm = new person('Niall', 'Horan');
console.log(nm.middleName);

nm.middleName='James';
console.log(nm.firstName);
console.log(nm.middleName);
console.log(nm.lastName);