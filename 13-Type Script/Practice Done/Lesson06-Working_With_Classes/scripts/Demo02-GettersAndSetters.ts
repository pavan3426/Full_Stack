class Movie{
    private movieId:number;
    private title : string;
    private rating:string;

    public getMovieId(): number {
        return this.movieId;
    }

    public setMovieId(movieId: number): void {
        this.movieId = movieId;
    }

    public getTitle(): string {
        return this.title;
    }

    public setTitle(title: string): void {
        this.title = title;
    }

    public getRating(): string {
        return this.rating;
    }

    public setRating(rating: string): void {
        this.rating = rating;
    }


    constructor(givenMovieId, givenMovieTitle, givenRating){
        this.movieId=givenMovieId;
        this.title=givenMovieTitle;
        this.rating=givenRating
    }
}