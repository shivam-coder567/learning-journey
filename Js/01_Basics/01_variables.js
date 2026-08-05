const accountId = 1234;
let accountEmail = "shivamXXX@gmail.com";
var accountPassword = 56789;
accountCity = "Prayagraj";

//const accountId = 56789; This is not possible
accountEmail = "mishraXXX@gmail.com";
accountPassword = 567;
accountCity = "DELHI";
let accountState;

/*
Prefer not to use var keyword 
because of issuse in block scope and function
*/

console.table([
  accountId,
  accountPassword,
  accountEmail,
  accountCity,
  accountState,
]);
