## 집계 서비스

이 저장소는 컨테이너 인프라 환경 구축을 위한 쿠버네티스/도커 책 실습 부분에서 예제로 배포되는 애플리케이션입니다. 애플리케이션은 SpringBoot 3(kotlin)을 사용하여 작성하였으며, 사용자가 요청한 대상에 점수를 집계하는 서비스를 제공합니다.
> Note: 이 애플리케이션을 단일로 구성하기 위해서는 OpenJDK 21 버전 이상이 필요합니다.

# 로컬 개발환경
- intelij IDEA 또는 이와 준하는Java IDE을 통해 프로젝트를 확인합니다.
- Gradle을 통해 프로젝트를 빌드합니다.
- 프로젝트를 실행합니다. 

## 컨테이너 이미지 빌드 방법
```shell
# 로깅을 위한 샘플 애플리케이션 빌드
docker buildx build --platform linux/amd64 -f .\Dockerfile.logs -t seongjumoon/aggregate-service:logs . --push
# 트레이싱을 위한 샘플 애플리케이션 빌드
docker buildx build --platform linux/amd64 -f .\Dockerfile.traces -t seongjumoon/aggregate-service:traces . --push
```