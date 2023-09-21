 class BookList{
    numberOfRead : number =8;
    numberOfUnread : number;
    nextBook : Book | null;
    currentBook : Book | null;
    lastBookRead : Book | null ;
    books :Book[];

    constructor(){
        this.books=[];
        this.numberOfRead=0;
        this.numberOfUnread=0;
        this.nextBook=null;
        this.currentBook=null;
        this.lastBookRead=null;
    }


    add(book : Book){
        this.books.push(book);
         this.numberOfUnread++;
         if(!this.currentBook){
            this.currentBook = book;
         }
         if(!this.nextBook){
            this.nextBook=book;
         }


    }
    finishCurrentBook(){
        if(this.currentBook){
            this.currentBook.read=true;
            this.currentBook.readDate =new Date(Date.now());
            this.numberOfRead++;
            this.numberOfUnread--;
            this.lastBookRead = this.currentBook;
            this.currentBook= this.nextBook;           
        }
    }
    updateNextBook (){
        for(const book of this.books){
            if(!book.read){
                this.nextBook = book;
                break;

            }
        }
        if(!this.nextBook){
            this.nextBook = null;

        }
        }
    }
 

 class Book{
    title: string;
    gener : string;
    author: string;
    read : boolean;
    readDate: Date | null;

    constructor(title : string, gener :string, author : string){
        this.title = title;
        this.gener = gener;
        this.author = author;
        this.read = false;
        this.readDate = null;
    }

 }

 var book1= new Book("java","coding","James Gosling");
 var book2= new Book("C Languages","Coding","Dennis Ritche");
 var book3 = new Book ("HTML","Markup Language","Tim Berners Lee");

 const bookList1 = new BookList();
 bookList1.add(book1);
 bookList1.add(book2);
 bookList1.add(book3);
 console.log(bookList1);
