interface Movie{
    movieId: number;
    title : string;
    rating : string;
}
// Object Construction with Strict norms

let mov1 : Movie = {
    movieId:1001,
    title : "Ramp Radha",
    rating : "Dont waste u r valuable time "
};

let mov2 : Movie = {
    movieId:1002,
    title : "Darling", //Problem because attributes are missed
    // rating : "Worth watching "
};

let mov3 : Movie = {
    movieId:1002,
    title : "Darling",
    rating : 123  //because data type is different
};


