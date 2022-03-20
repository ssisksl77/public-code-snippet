# 소개

JAVA AWS 람다 프로젝트의 JVM 매개변수를 최적화하기 위한 Lambda Layer.

# 사용법
Layer반영 후 `Environment variables` 에 다음값을 설정한다.

```
AWS_LAMBDA_EXEC_WRAPPER=/opt/wrapper-script.sh
```

`opt` 가 추가되는 이유는 layer function이 `/opt` 폴더에 추가되기 때문.`

# 해당 최적화가 유효한 이유 [WIP]

참고(내블로그) : https://ssisksl77.gitlab.io/jvm/aws-jvm-optimization.html

