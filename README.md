## imooc学习springboot网友整理代码
## git分支笔记
* `git init`
* `git remote add origin https://github.com/zjzsgs/Spring-Boot-Demo.git`
* `git checkout -b hotel` 新建并切换到分支
* `git add .`
* `git commit -m"提交到分支"`
* `git push origin hotel` 创建并提交到远程分支
## git操作笔记
* git退出> ctrl+d
* `git branch -a` 查看所有分支
* `git push origin girl` origin是远程仓库地址，girl是上游码流
## github提交需要输入用户名和密码的解决办法
* 方案一：
	* `git config --global credential.helper store` 在任意位置的git bash执行这个命令
	* 会在用户目录下的.gitconfig文件末添加:**[credential] helper = store**
	* push代码，第一次输入会在用户目录生成.git-credential文件记录用户名和密码**https://username:password@github.com**。
* 方案二：
	* 在用户目录下创建.git-credential
	* 在文件中输入**https://username:password@github.com**
	* 执行命令**git config --global credential.helper store**
	* 上面命令会在.gitconfig文件末添加:**[credential] helper = store**
	* push代码，不需要输入用户名和密码。
