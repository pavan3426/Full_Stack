class Movie {

    private movId: number;
    private title: string;
    private rating: string;

    public getMovId(): number {
        return this.movId;
    }

    public setMovId(movId: number): void {
        this.movId = movId;
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


    constructor(givenMovId, givenMovTitle, givenMovRating) {
        this.movId = givenMovId;
        this.title = givenMovTitle;
        this.rating = givenMovRating;
    }

    


}