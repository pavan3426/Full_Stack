class Menu {
    items: Array<string>; // Generics Used Here
    pages: number;

    constructor(givenItems: Array<string>, givenPages: number) {
        this.items = givenItems;
        this.pages = givenPages;
    }

    list(): void {
        console.log("Our Menu for Today ")
        for(var i = 0 ; i < this.items.length; i++) {
            console.log(this.items[i]);
        }
    }
}

var sundayMenu = new Menu(['Pancakes', 'Waffles', 'Orange Juice'], 1);
sundayMenu.list();
