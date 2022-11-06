 * اللَّهُمَّ صَلِّ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما صَلَّيْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 * اللَّهُمَّ بَارِكْ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما بَارَكْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 
 



# MyConnection By Yousef Shaaban

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
Or  Add it in your root settings.gradle :

        dependencyResolutionManagement {
	        ...
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	 }
  
Step 2. Add the dependency

	dependencies {
	         implementation 'com.github.YousefShaabanSaad:MyToast:1.0.1'
	}

Step 3. In Activity

           MyToast.setShortToast(this,"This is short Toast", MyToast.SUCCESS);

           MyToast.setLongToast(this,"This is long Toast", MyToast.FAIL);

# For contact
 * +201142747343
 * yousefshaabansaad42@gmail.com
	
