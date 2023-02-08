# 민주주의와 유혹 (Enticing Democracy)
"민주주의와 유혹"은 트위치 시청자가 투표로 스트리머의 월드에 영향을 주는 마인크래프트 1.19.2 Fabric 모드입니다.

## 세팅 방법
1. 최소 [Fabric Loader 0.14.10-1.19.2](https://fabricmc.net/use/installer/)를 설치합니다.
2. 모드 폴더에 해당 모드를 넣습니다.
3. 게임을 실행하고 설정에 들어갑니다.
4. 설정에서 `투표 방법 설정`에 들어갑니다.
5. 위에 있는 입력 박스에는 자신의 트위치 OAuth 토큰을 넣고 아래 박스에는 자신의 트위치 채널 이름을[^1] 넣습니다.
6. 트위치 방송을 시작합니다.

## 초보자들을 위한 트위치 토큰 구하기
1. [트위치 개발자용 콘솔](https://dev.twitch.tv/console/apps)에서 새로운 응용 프로그램을 등록합니다.
2. 이름을 아무렇게 짓고 OAuth 리디렉션 URL에 `https://dytroc.github.io/twitch-oauth/result.html`라고 넣고 `추가` 버튼을 누릅니다.
3. 범주는 `Game Integration`로 해두고 `만들기`를 누릅니다.
4. 응용 프로그램을 만들고 나서 해당 응용 프로그램의 `관리` 버튼을 누릅니다.
5. 거기서 `신규 시크릿` 버튼을 눌러서 클라이언트 시크릿을 가져옵니다.
6. 그 다음에 [이 사이트](https://dytroc.github.io/twitch-oauth)에 들어가서 클라이언트 ID는 위에다가 넣고 `5번째 과정`에서 얻은 클라이언트 시크릿은 아래에다가 넣습니다.
7. `토큰 가져오기` 버튼을 누릅니다.
8. 제대로 설정됐다면 `권한 부여` 버튼이 있을거고 그 버튼을 누릅니다.
9. 제대로 설정됐다면 트위치 토큰이 나올것입니다.[^2]
10. 이제 `세팅 방법`의 `6번째 과정`으로 넘어갑니다.

## 이 모드의 한계 및 확인된 문제점들
아직은 **싱글플레이**에서만 쓰실 수 있습니다.

## 라이센스
해당 프로젝트는 GNU 일반 공중 사용 허가서를 이용하고 있습니다.

## Original Source
[dytroc - EnticingDemocracy](https://github.com/dytroc/enticing-democracy)

[^1]: 정확히는 트위치 채널 아이디입니다. 만약에 한글, 한자, 가나와 같이 로마자가 아닌 문자가 들어가있을 경우, 아이디가 아닐 겁니다.
[^2]: 이렇게 생성된 토큰은 60일 동안 유효합니다.
[^3]: 수정된 프로젝트들에게도 적용되는 규칙입니다.
