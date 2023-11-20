public class Multiply {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = a*b;
        System.out.println(c);
    }
}


/*
PS C:\Users\Lenovo\Documents\Git-Github> git status  
On branch madh/multiply
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Diff.java
        modified:   Sum.java
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Multiply.class
        Multiply.java

PS C:\Users\Lenovo\Documents\Git-Github> git add Multiply.java

PS C:\Users\Lenovo\Documents\Git-Github> git commit -m "Multiply.java is added"
[madh/multiply 9eae12b] Multiply.java is added
 1 file changed, 8 insertions(+)
 create mode 100644 Multiply.java

PS C:\Users\Lenovo\Documents\Git-Github> git checkout dev
Switched to branch 'dev'
M       Diff.java
M       Sum.java

"dev bran contain diff and sum code and we want to insert multiply code into dev branch : git merge <branch name>"
PS C:\Users\Lenovo\Documents\Git-Github> git merge madh/multiply
Updating 543a615..9eae12b
Fast-forward
 Multiply.java | 8 ++++++++
 1 file changed, 8 insertions(+)
 create mode 100644 Multiply.java

PS C:\Users\Lenovo\Documents\Git-Github> git log
commit 9eae12bba2147888701fbcb1037d727382862056 (HEAD -> dev, madh/multiply)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>
Date:   Mon Nov 20 07:51:09 2023 +0530
    Multiply.java is added
commit 543a615e09ecc1330fe482e8da238fcc9f87f573 (master)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>
Date:   Sat Oct 28 18:42:52 2023 +0530
    added message in Sum.java
commit 8ca3d7d335986faf732b9dba3d4785a1edf4d3e4   
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>
Date:   Sat Oct 28 18:41:08 2023 +0530
    adding Diff.java
commit 3667f5ba3a0f44033cf7cca7d6704cf7da1719d0   
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>


PS C:\Users\Lenovo\Documents\Git-Github>git merge dev
Already up to date. "dev branch merge into master"

PS C:\Users\Lenovo\Documents\Git-Github> git log
commit 9eae12bba2147888701fbcb1037d727382862056 (HEAD -> dev, madh/multiply)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Mon Nov 20 07:51:09 2023 +0530
    Multiply.java is added
commit 543a615e09ecc1330fe482e8da238fcc9f87f573 (master)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Sat Oct 28 18:42:52 2023 +0530
    added message in Sum.java
commit 9eae12bba2147888701fbcb1037d727382862056 (HEAD -> dev, madh/multiply)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Mon Nov 20 07:51:09 2023 +0530
    Multiply.java is added

    "multiply.java is added to master"


******************************************************************
                    With Github
PS C:\Users\Lenovo\Documents\Git-Github> git remote -v
PS C:\Users\Lenovo\Documents\Git-Github> git remote add origin https://github.com/Madhura-barve/Learning-Git.git
PS C:\Users\Lenovo\Documents\Git-Github> git remote -v            
origin  https://github.com/Madhura-barve/Learning-Git.git (fetch)
origin  https://github.com/Madhura-barve/Learning-Git.git (push) 

PS C:\Users\Lenovo\Documents\Git-Github> git branch -M main

PS C:\Users\Lenovo\Documents\Git-Github> git push -u origin main  
fatal: unable to access 'https://github.com/Madhura-barve/Learning-Git.git/': Could not resolve host: github.com

*/