<div dir="rtl">

# المستوى السهل:
يحتوي المستوى السهل على `58` تحدي، بالترتيب التالي..

## 1. طرح عددين

### وصف التحدي

قم بكتابة `function` تستقبل عددين، العدد الأول يمثل رقماً صحيحاً `integer` والعدد الثاني يمثل أيضا رقماً صحيحاً `integer` ، ثم قم بإرجاع حاصل **طرح** هذين العددين.

### المخرجات المتوقعة

| Output | b    | a    |
| :------: | :----: | :----: |
| 5      | 5    | 10   |
| 6      | 3-   | 3    |
| 5-     | 1    | 4-   |
| 1      | 1-   | 0    |
| 0      | 0    | 0    |
| 92-    | 4-   | 96-  |

### الحل `C#`

</div>

```CS
public static long sub(int a, int b) {
        // write your code here
        return a - b;
    }
```

<div dir="rtl">

## 2. دمج قيمتين نصية

### وصف التحدي

قم بكتابة `function` تستقبل قيمتين من نوع `string` ، وتقوم **بجمعهما وإرجاعهما** كقيمة واحدة من نوع `string`

### المخرجات المتوقعة

| Output       | name2    | name1  |
| :------------ | :-------- | :------ |
| Be yourself  | yourself | Be     |
| !Hello World | !World   | Hello  |
| Coffee shop  | shop     | Coffee |
| Good morning | morning  | Good   |

### الحل `C#`

</div>

```CS
public static String concatNames(String name1, String name2) {
        // write your code here
        return name1 + " " + name2;
    }
```

<div dir="rtl">

## 3. باقي قسمة عددين

### وصف التحدي

قم بكتابة `function` تستقبل عددين، العدد الأول يمثل رقماً صحيحاً `integer` والعدد الثاني يمثل أيضا رقماً صحيحاً `integer` ، ثم قم بإرجاع حاصل **باقي قسمة** هذين العددين.

### المخرجات المتوقعة

| Output | b    | a    |
| :------: | :----: | :----: |
| 0      | 1    | 1    |
| 4      | 5    | 9    |
| 5      | 10   | 15   |
| 3      | 4    | 99   |

### الحل `C#`

</div>

```CS
public static long divRemainder(int a, int b) {
        // write your code here
        return a % b;
    }
```

<div dir="rtl">

## 4. موقعي في خط الأعداد الصحيحة

### وصف التحدي

قم بكتابة `function` تستقبل قيمة عددية `integer` وتقارن فيما إذا كانت القيمة المرسلة **أصغر من** أو **أكبر من** أو **تساوي** الصفر ثم قم بإرجاع قيمة نصية `string` تُعبّر عن حالة القيمة المرسلة.

### المخرجات المتوقعة

| Output            | number |
| :----------------- | :------: |
| Greater than zero | 9      |
| Equal to zero     | 0      |
| Less than zero    | 2-     |
| Less than zero    | 3-     |
| Greater than zero | 49     |

### الحل `C#`

</div>

```CS
public static String lessOrMoreThanZero(int number) {
        // write your code here
        if (number > 0) {
            return "Greater than zero";
        } else {
            return number < 0 ? "Less than zero" : "Equal to zero";
        }
    }
```

<div dir="rtl">

## 5. المتوسط الحسابي

### وصف التحدي

قم بكتابة `function` تستقبل مصفوفة `array` مكونة من أعداد صحيحة `integer` ثم قم بإرجاع **المتوسط الحسابي** لهذه الأعداد المرسلة في المصفوفة.

### المخرجات المتوقعة

| Output | array                   |
| :------: | :----------------------- |
| 94.6   | [2 , 4 , 9 , 23 , 435]  |
| 12.8   | [0 , 44 , 9 , 3 , 8]    |
| 61.0   | [99 , 23]               |
| 50.4   | [72 , 86 , 23 , 70 , 1] |
| 51.0   | [55 , 2 , 96]           |

### الحل `C#`

</div>

```CS
public static double average(int[] array) {
        // write your code here
        double sum = 0;

        for (int num : array)
            sum += num;

        return (sum / array.length);
    }
```

<div dir="rtl">

## 6. النصوص المتشابهة

### وصف التحدي

قم بكتابة `function` تستقبل قيمتين نصية `string` وتقوم بالتحقق فيما إذا كانتا **متشابهتين** أم **غير متشابهتين** في القيمة، ثم قم بإرجاع قيمة نصية `string` توضح ذلك.

### المخرجات المتوقعة

|    Output     |  name2   |  name1   |
| :----------- | :------ | :------ |
| غير متشابهتين |  ayman   |  Ayman   |
| غير متشابهتين |  Amrow   |   Amro   |
|   متشابهتين   |  Norah   |  Norah   |
| غير متشابهتين |   Anas   |  Mishal  |
|   متشابهتين   | Abdullah | Abdullah |

### الحل `C#`

</div>

```CS


```

<div dir="rtl">

## 7. عدد عناصر المصفوفة

### وصف التحدي

قم بكتابة `function` تستقبل مصفوفة `array` مكونة من أعداد صحيحة من نوع `integer`، ثم قم بإرجاع **عدد عناصر تلك المصفوفة**.

### المخرجات المتوقعة

| Output |               array               |
| :----: | :-------------------------------  |
|   5    |      [2 , 4 , 9 , 23 , 435]       |
|   6    |     [32 , 44 , 9 , 3 , 8, 1]      |
|   7    | [99 , 314 , 10, 11, 8 , 200 , 23] |
|   2    |            [72 , 86 ]             |
|   4    |        [55 , 64 , 0 , 11 ]        |

### الحل `C#`

</div>

```CS
public static int num_elements(int[] array) {
        // write your code here
        return array.length;
    }
```

<div dir="rtl">

## 8. الجمع التراكمي

### وصف التحدي

قم بكتابة `function` تستقبل مصفوفة `array` من نوع `integer` وتقوم بإرجاع **حاصل جمع جميع الأعداد** و **عدد العناصر** في الـ `array`.

### المخرجات المتوقعة

|  Output  |             array             |
| :------: | :--------------------------- |
| [473, 5] |    [2 , 4 , 9 , 23 , 435]     |
| [52, 4]  |       [32 , 9 , 3 , 8]        |
| [646, 6] | [99 , 314 , 8 , 200 , 23 , 2] |
| [158, 2] |           [72 , 86]           |
| [55, 1]  |             [55]              |

### الحل `C#`

</div>

```CS


```

<div dir="rtl">

## 9. عدد زوجي أم فردي

### وصف التحدي

قم بكتابة `function` تستقبل عدد من نوع `integer`، تقوم الـ `function` بإرجاع قيمة من نوع `string` توضّح ما إذا كان العدد **زوجي أو فردي**

### المخرجات المتوقعة

| Output | number |
| :----: | :---- |
|  فردي  |   9    |
|  فردي  |   1    |
|  زوجي  |   20   |
|  فردي  |   3    |
|  زوجي  |   48   |

### الحل `C#`

</div>

```CS
public static String oddEven(int number) {
        // write your code here
        if (number % 2 == 0) return "زوجي";
        return "فردي";
    }
```

<div dir="rtl">

## 10. نوع القيمة المدخلة

### وصف التحدي

قم بكتابة `function` تستقبل قيمة نصية `string` ، تقوم الـ `function` **بتحديد نوع القيمة الموجودة داخل الـ** `string` ما إذا كانت `string` أو `integer` أو `double` ، ثم قم بإرجاع نوع القيمة داخل `string`

### المخرجات المتوقعة

| Output  |      value      |
| :----- | :-------------: |
| string  | Hello everybody |
| integer |       323       |
| double  |      21.1       |

### الحل `C#`

</div>

```CS


```

<div dir="rtl">

## 11. طباعة آخر عنصر في المصفوفة

### وصف التحدي

قم بكتابة `function` تستقبل `array` من نوع `integer` ، وتقوم الـ `function` بإرجاع قيمة **آخر عنصر** في الـ `array`.

### المخرجات المتوقعة

| Output |            arr            |
| :----: | :----------------------- |
|  435   |  [2 , 4 , 9 , 23 , 435]   |
|   8    |   [32 , 44 , 9 , 3 , 8]   |
|   23   | [99 , 314 , 8 , 200 , 23] |
|   1    |  [72 , 86 , 23 , 70 , 1]  |
|   4    |  [55 , 64 , 0 , 11 , 4]   |

### الحل `C#`

</div>

```CS
public static int lastElm(int[] arr) {
        // write your code here
        return arr[arr.length - 1];
    }
```

<div dir="rtl">

## 12. حذف عنصر في المصفوفة

### وصف التحدي

قم بكتابة `function` تستقبل قيمتين الأولى `array` من نوع `integer` والثانية عدد صحيح موجب `Non-negative integer` ، بحيث تقوم الـ `function` **بحذف العنصر الذي يحتوي على نفس رقم الـ** `index` الذي تم تمريره للـ `function` من الـ `array` المرسلة ثم تقوم بإرجاع `array` جديدة ناتجة عن عملية الحذف

### المخرجات المتوقعة

| Output  | index |     arr      |
| :-----: | :---: | :----------: |
| [2 , 4] |  `2`  | [2 , 4 , 88] |
| [4 , 0] |  `0`  | [3- , 4 , 0] |

### الحل `C#`

</div>

```CS
public static int[] deleteElementInArray(int[] arr, int index) {
        // write your code here
        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
```
