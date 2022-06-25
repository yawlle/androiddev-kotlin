# androiddev-kotlin

Aplicação que mostra todos os títulos do subreddit /androiddev
- Utilização do Retrofit (melhor opção para uma API como essa do Reddit que os dados vem dentro de outros dados, precisando de desserialização).
- Utilização de RecycleView para mostrar ao usuário um conjunto de dados em forma de lista de itens. 
- Utilização do Gson, converte e desconverte objetos Java em JSON.

<h3>TODO List</h3>

- Activitys não tem obrigação de carregar lógica de requests. Procurar saber sobre MVVM e aplicar essa lógica em um componente separado. 
- Buscar formas de aplicar desserialização de API's utilizando Valley, ou alguma forma nativa e mais simples do que a utilizada (pois precisei fazer classes e mais classes para se adaptar a API). 
- Buscar saber se o Gson só converte objetos Java e se é saudável manter objetos Java dentro de um projeto Kotlin. 

<h3>Screenshots</h3>
  
  ![Alt text](https://user-images.githubusercontent.com/75861637/175790698-7404e1d2-013d-456d-97ea-3b7f80420b7b.png "Screenshot 1")
  
  ![Alt text](https://user-images.githubusercontent.com/75861637/175790700-c8da81f9-a076-4b23-bdb5-98147c88039d.png "Screenshot 2")
  
 
