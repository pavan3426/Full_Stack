interface Movie {
    movId: number;
    title: string;
    rating: string;
}

// Object Construction With Strict Norms
let mov1: Movie = {
    movId:1001,
    title: "Vikram",
    rating: "Fantabulous"
};

let mov2: Movie = {
    movId:1001,
    title: "Vikram", // Problem Becoz Attributes Have Missed
};

let mov3: Movie = {
    movId:1001,
    title: "Vikram",
    rating: 123 /// Problem Becoz Different Type
};