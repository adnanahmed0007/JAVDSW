// const obj = {
//     name: "m,,",
//     age: 12
// }
// for (let key in obj) {
//     console.log(obj[key])
// }
// let str = "ch";
// for (const ch of str) {
//     console.log(ch)

// }
// function outer(a = 90, b) {
//     let k = a + 1;
//     function inner() {
//         k++;

//         return k;

//     }
//     return inner;
// }

// let k1 = outer();
// console.log(k1())
// console.log(k1())
// console.log(k1())



// const free = {
//     name: "adna",
//     greet() {
//         console.log(this.name)

//     }
// }
// free.greet()

function fre() {
    console.log(this)
}
const user = {
    name: "adnan",
    age: "000",
    fre

}
user.fre();





















