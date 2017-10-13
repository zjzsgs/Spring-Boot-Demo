# [Spring Boot进阶之Web进阶](http://www.imooc.com/learn/810)
代码整理
## git提交分支笔记
### 提交代码到远程分支
* 在本地创建一个分支：`git branch girl(分支名)`
* 切换到新分支：`git checkout girl`
* 提交分支：`git push origin(远程仓库名) girl`
* 在远程仓库可以看到一个新建的分支
* 删除本地分支：`git branch -d gril(分支名)`
* 删除远程分支：`git push origin :girl`(分支前的冒号代表删除)
### 提交本地分支代码到远程仓库
* 创建分支
* 切换分支
* add commit
* 切换到master分支：`git checkout master`
* 从服务器拉取最新代码：`git pull`
* 切换到新分支：`git checkout girl`
* 检查与master是否有冲突：`git rebase master`
* 解决冲突：`git add .` `git rebase --continue`
* 反复执行以上两步，知道冲突全部解决。
* 推送分支代码：`git push origin girl:master`
