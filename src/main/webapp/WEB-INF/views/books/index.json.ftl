[
<#list books as book>
    {
        "id": "${book.id}",
        "title": "${book.title}",
        "author": "${book.author}"
    }
    <#if book_has_next>,</#if>
</#list>
]



