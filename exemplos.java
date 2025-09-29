<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Futsal no Brasil</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #4CAF50; /* verde médio inicial */
      color: #222;
      display: flex;
      flex-direction: column;
      align-items: center;
      text-align: center;
      margin: 0;
      padding: 20px;
    }

    h1 {
      color: #FFD700; /* amarelo destaque */
    }

    button {
      background-color: #228B22; /* verde forte para botões */
      color: white;
      padding: 10px 20px;
      border: none;
      margin: 10px;
      cursor: pointer;
      border-radius: 5px;
      transition: 0.3s;
    }

    button:hover {
      background-color: #FFD700;
      color: #222;
    }

    input {
      padding: 8px;
      border-radius: 5px;
      border: 1px solid #ccc;
      margin-top: 5px;
    }

    img {
      width: 280px;
      border-radius: 10px;
      margin: 15px 0;
      box-shadow: 0 2px 8px rgba(0,0,0,0.3);
    }

    .box {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      margin: 15px 0;
      width: 80%;
      max-width: 500px;
      box-shadow: 0 2px 6px rgba(0,0,0,0.2);
    }

    #frase {
      font-weight: bold;
      color: #006400;
      margin-top: 10px;
    }
  </style>
</head>
<body onload="alert('Bem-vindo ao site sobre Futsal no Brasil! ⚽🇧🇷')">

  <h1 id="titulo">Futsal no Brasil</h1>

  <!-- Alterar texto -->
  <div class="box">
    <h2>História do Futsal</h2>
    <p id="historia">O futsal é um dos esportes mais praticados no Brasil.</p>
    <button onclick="document.getElementById('historia').innerText='O futsal surgiu no Brasil na década de 1930, desde sua criação, o futsal brasileiro se destaca mundialmente, revelando jogadores renomados como Falcão, Manoel Tobias e Fernandinho.'">Saiba mais</button>
  </div>

  <!-- Trocar cor de fundo -->
  <div class="box">
    <h2>Escolha a cor do campo</h2>
    <button onclick="document.body.style.backgroundColor='#87CEFA'">Azul</button>
    <button onclick="document.body.style.backgroundColor='#C71585'">Violeta</button>
    <button onclick="document.body.style.backgroundColor='#006400'">Verde Forte</button>
  </div>

  <!-- Data e hora -->
  <div class="box">
    <h2>Data e Hora Atual</h2>
    <p id="dataHora">Clique no botão para ver</p>
    <button onclick="document.getElementById('dataHora').innerText = new Date()">Mostrar</button>
  </div>

  <!-- Troca de imagem + frase -->
  <div class="box">
    <h2>Craques do Futsal</h2>
    <img id="foto" 
         src="https://i0.wp.com/jornalgrandebahia.com.br/wp-content/uploads/2025/08/Selecao-Brasileira-de-Futsal-Feminino-20250821.jpg?fit=2400%2C1600&quality=100&ssl="
         onmouseover="mudarImagem('https://lncimg.lance.com.br/uploads/2024/10/brasil-copa-do-mundo-de-futsal-1-scaled-aspect-ratio-512-320-2.jpg','A Seleção Masculina é referência mundial, com 5 títulos da Copa do Mundo de Futsal!')"
         onmouseout="mudarImagem('https://i0.wp.com/jornalgrandebahia.com.br/wp-content/uploads/2025/08/Selecao-Brasileira-de-Futsal-Feminino-20250821.jpg?fit=2400%2C1600&quality=100&ssl=','O futsal feminino cresce a cada ano e já conquista títulos internacionais!')">
    <p id="frase">O futsal feminino cresce a cada ano e já conquista títulos internacionais!</p>
  </div>

  <!-- Contador -->
  <div class="box">
    <h2>Contador de Gols</h2>
    <p id="contador">0</p>
    <button onclick="aumentar()">Marcar Gol</button>
  </div>

  <!-- Formulário com validação -->
  <div class="box">
    <h2>Deixe sua opinião</h2>
    <form onsubmit="return validar()">
      <input type="text" id="nome" placeholder="Digite seu nome"><br><br>
      <button type="submit">Enviar</button>
    </form>
  </div>

  <!-- Mostrar/ocultar texto -->
  <div class="box">
    <h2>Curiosidades</h2>
    <p id="curiosidade" style="display:none;">
     O futsal é chamado de "futebol de salão" por 
     ser praticado em quadras cobertas.<br>
     Um jogo oficial tem 2 tempos de 20 minutos, com cronômetro parado a cada interrupção.<br>
     O Brasil já sediou Copa do Mundo de Futsal da FIFA em 2008.
    </p>
    <button onclick="mostrarOcultar()">Mostrar/Esconder</button>
  </div>

  <!-- Alterar tamanho da fonte -->
  <div class="box">
    <h2>Mudar tamanho do texto</h2>
    <p id="textoFutsal">O futsal é conhecido pela habilidade, velocidade e muitos gols.</p>
    <button onclick="document.getElementById('textoFutsal').style.fontSize='12px'">Pequeno</button>
    <button onclick="document.getElementById('textoFutsal').style.fontSize='18px'">Médio</button>
    <button onclick="document.getElementById('textoFutsal').style.fontSize='24px'">Grande</button>
  </div>

  <script>
    // Troca de imagem + frase
    function mudarImagem(novaImg, novaFrase) {
      document.getElementById("foto").src = novaImg;
      document.getElementById("frase").innerText = novaFrase;
    }

    // Contador
    let contador = 0;
    function aumentar() {
      contador++;
      document.getElementById("contador").innerText = contador;
    }

    // Validação
    function validar() {
      let nome = document.getElementById("nome").value;
      if (nome === "") {
        alert("Por favor, preencha o nome!");
        return false;
      }
      alert("Obrigado, " + nome + "! Sua opinião foi registrada.");
      return true;
    }

    // Mostrar/Ocultar curiosidade
    function mostrarOcultar() {
      let texto = document.getElementById("curiosidade");
      if (texto.style.display === "none") {
        texto.style.display = "block";
      } else {
        texto.style.display = "none";
      }
    }
  </script>

</body>
</html>
