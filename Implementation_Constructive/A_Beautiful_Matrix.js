const readline = require('readline');

// Importing required modules

// Creating an interface for input/output
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

// Function to solve the problem
function solve() {
    // TODO: Write your solution here
    
    // Reading input
    rl.question('Enter input: ', (input) => {
        // TODO: Process the input and solve the problem
        
        // Printing the output
        console.log('Output:', output);
        
        // Closing the interface
        rl.close();
    });
}

// Calling the solve function
solve();