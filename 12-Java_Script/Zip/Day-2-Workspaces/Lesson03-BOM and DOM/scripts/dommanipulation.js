function actionPerformed() {

    var articleElement = document.getElementById("article-1");

    // Add The Paragraph Element 
    var headingElement = document.createElement("h2");
    var text = "This is a New Header Text ";

    // To Indicate the Text is Body Content
    var newTextElement = document.createTextNode(text);

    // Add This to the Header
    headingElement.appendChild(newTextElement);

    // Add to the Article
    articleElement.appendChild(headingElement);

}