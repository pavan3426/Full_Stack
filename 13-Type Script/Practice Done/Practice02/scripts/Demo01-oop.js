var BookList = /** @class */ (function () {
    function BookList() {
        this.books = [];
        this.numberOfRead = 0;
        this.numberOfUnread = 0;
        this.nextBook = null;
        this.currentBook = null;
        this.lastBookRead = null;
    }
    BookList.prototype.add = function (book) {
        this.books.push(book);
    };
    BookList.prototype.finishCurrentBook = function () {
        if (this.currentBook) {
            this.currentBook.read = true;
            this.currentBook.readDate = new Date(Date.now());
            this.numberOfRead++;
            this.numberOfUnread--;
            this.lastBookRead = this.currentBook;
            this.currentBook = this.nextBook;
        }
    };
    BookList.prototype.updateNextBook = function () {
        for (var _i = 0, _a = this.books; _i < _a.length; _i++) {
            var book = _a[_i];
            if (!book.read) {
                this.nextBook = book;
                break;
            }
        }
        if (!this.nextBook) {
            this.nextBook = null;
        }
    };
    return BookList;
}());
var Book = /** @class */ (function () {
    function Book(title, gener, author) {
        this.title = title;
        this.gener = gener;
        this.author = author;
        this.read = false;
        this.readDate = null;
    }
    return Book;
}());
var book1 = new Book("java", "coding", "James Gosling");
var book2 = new Book("C Languages", "Coding", "Dennis Ritche");
var book3 = new Book("HTML", "Markup Language", "Tim Berners Lee");
var bookList1 = new BookList();
bookList1.add(book1);
bookList1.add(book2);
bookList1.add(book3);
console.log(bookList1);
