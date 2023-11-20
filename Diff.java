public class Diff {
    public static void main(String[] args) {
      System.out.println("I am learning git/github");
    }
}

/*

PS C:\Users\Lenovo\Documents\Git-Github> git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Sum.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Diff.java

no changes added to commit (use "git add" and/or "git commit -a")

PS C:\Users\Lenovo\Documents\Git-Github> git add Diff.java

PS C:\Users\Lenovo\Documents\Git-Github> git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Diff.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)      
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Sum.java

PS C:\Users\Lenovo\Documents\Git-Github>

PS C:\Users\Lenovo\Documents\Git-Github> git commit -m "adding Diff.java"
[master 8ca3d7d] adding Diff.java
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Diff.java

PS C:\Users\Lenovo\Documents\Git-Github>

PS C:\Users\Lenovo\Documents\Git-Github> git add Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git commit -m "added message in Sum.java"
[master 543a615] added message in Sum.java
 1 file changed, 57 insertions(+), 1 deletion(-)

PS C:\Users\Lenovo\Documents\Git-Github> git log
commit 543a615e09ecc1330fe482e8da238fcc9f87f573 (HEAD -> master)
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Sat Oct 28 18:42:52 2023 +0530

    added message in Sum.java

commit 8ca3d7d335986faf732b9dba3d4785a1edf4d3e4
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Sat Oct 28 18:41:08 2023 +0530

    adding Diff.java

commit 3667f5ba3a0f44033cf7cca7d6704cf7da1719d0
Author: Madhura Gajanan Barve <madhurabarve3101@gmail.com>        
Date:   Sat Oct 28 18:22:54 2023 +0530
     initial Commit

PS C:\Users\Lenovo\Documents\Git-Github> git checkout 3667f5ba3a0f44033cf7cca7d6704cf7da1719d0
error: Your local changes to the following files would be overwritten by checkout:
        Diff.java
        Sum.java
Please commit your changes or stash them before you switch branches.
Aborting
PS C:\Users\Lenovo\Documents\Git-Github> git checkout master
Already on 'master'
M       Diff.java
M       Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git  branch dev
PS C:\Users\Lenovo\Documents\Git-Github> git branch   
  dev
* master

PS C:\Users\Lenovo\Documents\Git-Github> git checkout dev 
Switched to branch 'dev'
M       Diff.java
M       Sum.java

PS C:\Users\Lenovo\Documents\Git-Github> git checkout -b madh/multiply
Switched to a new branch 'madh/multiply'



 */