# utilscan2
android 扫码，扫描二维码，扫描条形码.秒射,两个扫码两个机制，都秒射哈

配置： 
        1.根build.gradle添加

                allprojects {
                    repositories {
                        google()
                        jcenter()
                        maven { url 'https://jitpack.io' } //添加仓库依赖
                    }
                }
        2.module的build.gradle添加

              compile 'com.github.wangfeixixi:utilscan2:v1.3'
       
      
完工开始体验： 
       public class MainActivity extends CaptureActivity {

        }
如果觉得好请给我点赞哈！

如果需要进一步交流，邮件哦：xuanyuanxixi@foxmail.com

[![](https://jitpack.io/v/wangfeixixi/utilscan2.svg)](https://jitpack.io/#wangfeixixi/utilscan2)
