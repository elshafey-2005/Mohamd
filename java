function imgSlider(anything) {
            document.querySelector('.main-img').src = anything;
        }

        
        window.addEventListener('scroll', () => {
            const header = document.querySelector('header');
            header.classList.toggle('scrolled', window.scrollY > 0);
        });

        const menuToggle = document.querySelector('.menu-toggle');
        const navigation = document.querySelector('header ul');
        
        menuToggle.addEventListener('click', () => {
            menuToggle.classList.toggle('active');
            navigation.classList.toggle('active');
        });
