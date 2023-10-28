public class Sum{
    public static void main(String[] args) {
        
        int a = 3;
        int b = 5;
        int c = a+b;
        System.out.println("Sum is " + c);
    }
}

/* 
PS C:\Users\Lenovo\Documents\Git-Github> git init
Initialized empty Git repository in C:/Users/Lenovo/Documents/Git-Github/.git/

PS C:\Users\Lenovo\Documents\Git-Github> ls


    Directory: C:\Users\Lenovo\Documents\Git-Github


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----        28-10-2023     18:16            179 Sum.java       


PS C:\Users\Lenovo\Documents\Git-Github> git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)  
        Sum.java

nothing added to commit but untracked files present (use "git add" to track)

PS C:\Users\Lenovo\Documents\Git-Github> git add Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git status      
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git commit -m "initial Commit"
[master (root-commit) 3667f5b] initial Commit
 1 file changed, 9 insertions(+)
 create mode 100644 Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git log
commit 3667f5ba3a0f44033cf7cca7d6704cf7da1719d0 (HEAD -> master)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Sat Oct 28 18:22:54 2023 +0530

    initial Commit

PS C:\Users\Lenovo\Documents\Git-Github> 




*/