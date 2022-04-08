function isVowel(c)
{
    return (c == 'A' || c == 'E' ||
            c == 'I' || c == 'O' ||
            c == 'U' || c == 'a' ||
            c == 'e' || c == 'i' ||
            c == 'o' || c == 'u');
}
 
function pigLatin(s)
{
    var len = s.length;
    var index = -1;
    for (let i = 0; i < len; i++)
    {
        if (isVowel(s[i]))
        {
            index = i;
            break;
        }
    }
 
    if (index == -1)
        return "-1";
 
    return s.substring(index) +
           s.substring(0, index)
                          + "ay";
}
 
 
str = pigLatin("graphic");
 
if (str == "-1")
    document.write("No vowels"
             + "found. Pig Latin"
              + " not possible");
else
    document.write(str);