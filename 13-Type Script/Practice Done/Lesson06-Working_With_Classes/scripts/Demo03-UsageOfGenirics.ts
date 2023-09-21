class Menu{
    items: Array<string>;
    pages :number;

    constructor(givenItems: Array<string>, givenPages : number){
        this.items = givenItems;
        this.pages=givenPages;
    }

    list():void {
        console.log("our Menu for today ")
        for(var i=0;i<this.items.length;i++){
            console.log(this.items[i]);
        }
    }

}
var sundayMenu = new Menu([`pancakes`,`waffles`,`ornage juice`],4);
// var sundayMenu=new Menu([`chapati`, `idly`, `sambar`], 2);
sundayMenu.list();