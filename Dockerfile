# 版本信息
FROM mysql:5.7
MAINTAINER daisy "jingchenxu2015@gmail.com"

# 创建与daisy相关的文件夹
RUN mkdir /daisy

# 设置mysql免密码登录
ENV MYSQL-ALLOW_EMPTY_PASSWORD yes

# 初始化mysql 参考http://www.jb51.net/article/115422.htm
COPY setup.sh /daisy/setup.sh
COPY daisy.sql /daisy/daisy.sql
COPY privileges.sql /daisy/privileges.sql
CMD ["sh", "/daisy/setup.sh"]

# 安装jdk环境
ADD jdk-8u162-linux-x64.tar.gz /daisy/
ENV JAVA_HOME=/daisy/jdk1.8.0_162
ENV PATH $PATH:$JAVA_HOME/bin

# 对外暴露端口号
EXPOSE 4000

# 启动daisy
ADD /daisy-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/daisy-0.0.1-SNAPSHOT.jar"]
