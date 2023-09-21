var Menu = /** @class */ (function () {
    function Menu(givenItems, givenPages) {
        this.items = givenItems;
        this.pages = givenPages;
    }
    Menu.prototype.list = function () {
        console.log("our Menu for today ");
        for (var i = 0; i < this.items.length; i++) {
            console.log(this.items[i]);
        }
    };
    return Menu;
}());
var sundayMenu = new Menu(["pancakes", "waffles", "ornage juice"], 4);
// var sundayMenu=new Menu([`chapati`, `idly`, `sambar`], 2);
sundayMenu.list();
